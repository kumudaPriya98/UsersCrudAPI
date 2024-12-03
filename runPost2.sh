curl -X 'POST' \
  'http://localhost:8080/users/abcd/posts/' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "text": "second post of user abcd"
}'