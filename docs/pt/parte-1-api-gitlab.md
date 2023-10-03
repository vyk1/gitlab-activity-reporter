# Sobre

O GitLab fornece uma API para listar as atividades. Siga as instruções a seguir para gerar o relatório referente ao seu perfil.

1. Criar uma [PAT](https://gitlab.com/-/profile/personal_access_tokens)
> Nota: você não precisa fazer uma query para seu ID, sua PAT já irá direcionar suas requisições para suas atividades.
2. No terminal execute uma das abaixo para gerar relatórios para issue, merge request e comment respectivamente.

- curl -o i.json --silent --header "PRIVATE-TOKEN: <SUA PAT>" https://gitlab.com/api/v4/events?target_type=issue&sort=asc

- curl -o mr.json --silent --header "PRIVATE-TOKEN: <SUA PAT>" https://gitlab.com/api/v4/events?target_type=merge_request&sort=asc

- curl -o comm.json --silent --header PRIVATE-TOKEN: <SUA PAT> https://gitlab.com/api/v4/events?action=commented&sort=asc

> Nota: você pode adicionar parâmetros entre datas para um usuário específico (/users/:id/events), também:
`curl -o i-desde-2020.json --silent --header "PRIVATE-TOKEN: <SUA PAT>" https://gitlab.com/api/v4/users/245/events?target_type=issue&after=2020-01-01`

4. Siga o [tutorial](./parte-2-a-classe-facilitadora.md) para continuar.

Referências:
- https://docs.gitlab.com/ee/api/rest/
- https://docs.gitlab.com/ee/api/users.html
- https://docs.gitlab.com/ee/api/events.html

