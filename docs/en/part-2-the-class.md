# The `Report Facilitator Class`

> Note: This class is currently focused on issues (`i.json`). In the future, it may be rethought to generate reports based on comments (`comm.json`) or provide more details (`mr.json`).

The Facilitator is a Java class that, through the GitLab API, provides a summary of activities carried out during a specific period. To do this, you need to have your PAT. Check [here](./parte-1-api-gitlab.md) for instructions on how to obtain it.

## Configuring the Class

After generating your `i.json` (JSON containing activities related to issues), make sure it is located alongside the `FacilitadorRelatorio.java` class that was generated.

Execute the class, and the summary will be displayed in the console.