package main;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FacilitadorRelatorio {

	public static class Author {

		public int id;
		public String username;
		public String name;
		public String state;
		public String avatar_url;
		public String web_url;

	}

	public static class Root {

		public Root(int id, int project_id, String action_name, int target_id, int target_iid, String target_type, int author_id, String target_title, Date created_at, Author author, String author_username) {
			super();
			this.id = id;
			this.project_id = project_id;
			this.action_name = action_name;
			this.target_id = target_id;
			this.target_iid = target_iid;
			this.target_type = target_type;
			this.author_id = author_id;
			this.target_title = target_title;
			this.created_at = created_at;
			this.author = author;
			this.author_username = author_username;
		}

		public Root() {

		}

		public int id;
		public int project_id;
		public String action_name;
		public int target_id;
		public int target_iid;
		public String target_type;
		public int author_id;
		public String target_title;
		public Date created_at;
		public Author author;
		public String author_username;

	}

	public static void main(String[] args) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Root[] example = objectMapper.readValue(new File("i.json"), Root[].class);

			String header = "Contribuições de " + formatarData(example[example.length - 1]) + " até " + formatarData(example[0]) + "\n\n";
			String body = "";

			for (Root o : example) {
				if (o.action_name.equals("closed")) {
					body += "Tarefa \"" + o.target_title + "\" finalizada em " + formatarData(o) + "\n";
				} else {
					if (o.action_name.equals("opened")) {
						body += "Tarefa \"" + o.target_title + "\" iniciada em " + formatarData(o) + "\n";
					}
				}
			}
			System.out.println(header + body);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String formatarData(Root o) {
		return new SimpleDateFormat("dd/MM/yyyy").format(o.created_at);
	}

}
