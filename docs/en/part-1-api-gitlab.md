# About

GitLab provides an API for listing activities. Follow the instructions below to generate a report for your profile.

1. Create a [PAT](https://gitlab.com/-/profile/personal_access_tokens)
> Note: You don't need to query for your ID; your PAT will already direct your requests to your activities.

2. In the terminal, execute one of the commands below to generate reports for issues, merge requests, and comments, respectively:

- To generate an issue report:
  ```bash
  curl -o i.json --silent --header "PRIVATE-TOKEN: <YOUR PAT>" https://gitlab.com/api/v4/events?target_type=issue&sort=asc
  ```

- To generate a merge request report:
  ```bash
  curl -o mr.json --silent --header "PRIVATE-TOKEN: <YOUR PAT>" https://gitlab.com/api/v4/events?target_type=merge_request&sort=asc
  ```

- To generate a comment report:
  ```bash
  curl -o comm.json --silent --header "PRIVATE-TOKEN: <YOUR PAT>" https://gitlab.com/api/v4/events?action=commented&sort=asc
  ```

> Note: You can add parameters for a specific user and date range (/users/:id/events) as well:
  ```bash
  curl -o i-since-2020.json --silent --header "PRIVATE-TOKEN: <YOUR PAT>" https://gitlab.com/api/v4/users/245/events?target_type=issue&after=2020-01-01
  ```

3. Follow the [tutorial](./parte-2-a-classe-facilitadora.md) to continue.

References:
- [GitLab API Documentation](https://docs.gitlab.com/ee/api/rest/)
- [GitLab Users API Documentation](https://docs.gitlab.com/ee/api/users.html)
- [GitLab Events API Documentation](https://docs.gitlab.com/ee/api/events.html)