package com.pragma.getByAge;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handler implements RequestHandler<Request,Object> {

    @Override
    public Object handleRequest(Request request, Context context) {

        AmazonDynamoDB db = AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDBMapper mapper = new DynamoDBMapper(db);

        if (request.getHttpMethod().equals("GET")){
            if (request.getEdad() > 0){

                Map<String, AttributeValue> clientes = new HashMap<String, AttributeValue>();
                clientes.put(":edadIn", new AttributeValue().withN(String.valueOf(request.getEdad())));
                DynamoDBScanExpression scanExpression = new DynamoDBScanExpression()
                                                            .withFilterExpression("edad >= :edadIn")
                                                            .withExpressionAttributeValues(clientes);

                List<Cliente> resultados = mapper.scan(Cliente.class, scanExpression);
                return resultados;
            }else {
                return null;
            }
        }
        return null;
    }
}
