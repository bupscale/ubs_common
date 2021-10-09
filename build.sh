docker image rm bupscale/jpa-commons:0.0.1-PROD

docker build --no-cache -t bupscale/jpa-commons:0.0.1-PROD .

echo "Image bupscale/jpa-commons:0.0.1-PROD build complete"