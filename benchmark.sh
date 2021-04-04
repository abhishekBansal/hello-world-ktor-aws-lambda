echo "URL: $1"
echo ""
echo "######## Warming up Lambda #######"
echo ""
wrk -d10s "$1"

for i in 1 2 3 4 5
do
  echo ""
  echo "######## BENCHMARK RUN $i #######"
  echo ""
  wrk -d10s "$1"
done