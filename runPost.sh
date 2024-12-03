curl -X 'POST' \
  'http://localhost:8080/users/' \
  -H 'accept: application/hal+json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": "abcd",
  "name": "erttt",
  "phoneNumber": "888800000",
  "gender": "Male"
}'