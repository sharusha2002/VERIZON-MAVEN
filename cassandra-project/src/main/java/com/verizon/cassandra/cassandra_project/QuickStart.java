package com.verizon.cassandra.cassandra_project;
import com.dtsx.astra.sdk.AstraDB;
import com.dtsx.astra.sdk.AstraDBCollection;
import io.stargate.sdk.data.domain.JsonDocument;
import io.stargate.sdk.data.domain.JsonDocumentResult;
import io.stargate.sdk.data.domain.SimilarityMetric;
import io.stargate.sdk.data.domain.CollectionDefinition;
import java.util.List;
import java.util.stream.Stream;

public class QuickStart {
  public static void main(String[] args) {
    AstraDB db = new AstraDB("AstraCS:PjBanAZjiYAvQvuWEXUNERBN:81f8f6338f4fdad6932a6aba86a6ae9ab58d3dc0dd72e56c0824db62139e5df1", "https://4a627a73-7590-4709-afb4-8a25c72c2113-us-east-1.apps.astra.datastax.com");
    System.out.println("Connected to AstraDB");
    db.findAllCollections()
      .map(CollectionDefinition::getName)
      .forEach(col -> System.out.println("Collection:" + col));
 }
}