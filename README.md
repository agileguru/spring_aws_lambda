# spring_aws_lambda

An easy to deploy demo application using [SAM](https://aws.amazon.com/serverless/sam/) and SnapStart. A framework to deploy lambda function developed using spring boot


## Assumption

1. You have machine which has aws configured using aws cli
1. You already have sam cli installed as documented at [SAM](https://aws.amazon.com/serverless/sam/)

## How To Manage

1. Fork this repository into your own
1. Clone the new repository
1. Change the values in samconfig.toml as needed

> region = "us-east-1"   

1. Change the values in template.yaml as needed

> AutoPublishAlias: demo
> MemorySize: 512

## How to Package and Deploy

> sam build 
> sam deploy

## Get and Invoke Endpoint 

1. Login to AWS Console e.g. https://us-east-1.console.aws.amazon.com/lambda/home?region=us-east-1#/applications/demo
2. Get the API endpoint listed e.g. https://ve89t94jtd.execute-api.us-east-1.amazonaws.com/Prod 
3. Invoke the endpoint e.g. https://ve89t94jtd.execute-api.us-east-1.amazonaws.com/Prod/hello 

