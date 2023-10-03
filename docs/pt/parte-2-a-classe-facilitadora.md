# A Classe `FacilitadorRelatorio` 

> Nota: Esta classe é voltada para apenas issues (`i.json`). No futuro, pode ser repensada para gerar revisões baseados em comentários (`comm.json`) ou fornecer mais detalhes (`mr.json`).

O Facilitador é uma classe em Java que através da API do Gitlab, fornece um resumo das atividades desenvolvidas durante um período. Para isto é necessário que você tenha sua PAT. Confira [aqui](./parte-1-api-gitlab.md) como.

## Configurando a classe

Após gerar seu `i.json` (JSON que contem as atividades referentes às issues), certifique-se de que esta encontre-se no junto da classe `FacilitadorRelatorio.java` gerada.

Execute e o resumo estará no console.
