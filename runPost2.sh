curl -X 'POST' \
  'http://localhost:8080/posts/' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "text": "string"
}'