docker image rm bupscale/jpa-common:0.0.1-PROD

docker build --no-cache -t bupscale/jpa-common:0.0.1-PROD .

echo "Image bupscale/jpa-common:0.0.1-PROD build complete"