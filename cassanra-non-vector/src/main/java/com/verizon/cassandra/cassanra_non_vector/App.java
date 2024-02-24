package com.verizon.cassandra.cassanra_non_vector;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.stargate.grpc.StargateBearerToken;
import io.stargate.proto.QueryOuterClass;
import io.stargate.proto.StargateGrpc;

/**
 * Hello world!
 *
 */
public class App 
{
   
              private static final String ASTRA_DB_ID      = "oeZhAzhyqRSfjuZDWCGdZIAs";
        private static final String ASTRA_DB_REGION  = "us-east1";
        private static final String ASTRA_TOKEN      = "AstraCS:oeZhAzhyqRSfjuZDWCGdZIAs:d4fe5a8593ec8cba40aa4a5dd414446f004bbc12831ef76df8d9f412a87b92a0";
        private static final String ASTRA_KEYSPACE   = "casandra";

        public static void main(String[] args)
        throws Exception {
          //-------------------------------------
          // 1. Initializing Connectivity
          //-------------------------------------
          ManagedChannel channel = ManagedChannelBuilder
                  .forAddress(ASTRA_DB_ID + "-" + ASTRA_DB_REGION + ".apps.astra.datastax.com", 443)
                  .useTransportSecurity()
                  .build();

          // blocking stub version
          StargateGrpc.StargateBlockingStub blockingStub =
              StargateGrpc.newBlockingStub(channel)
                  .withDeadlineAfter(10, TimeUnit.SECONDS)
                  .withCallCredentials(new StargateBearerToken(ASTRA_TOKEN));
          
          QueryOuterClass.Response queryString = blockingStub.executeQuery(QueryOuterClass
        		  .Query.newBuilder()
        		  .setCql("SELECT * from " + ASTRA_KEYSPACE + ".engineers")
        		  .build());
    }
}
