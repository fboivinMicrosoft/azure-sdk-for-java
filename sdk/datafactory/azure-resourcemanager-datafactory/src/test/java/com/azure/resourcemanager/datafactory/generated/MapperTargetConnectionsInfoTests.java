// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.DataMapperMapping;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MapperAttributeMapping;
import com.azure.resourcemanager.datafactory.models.MapperAttributeMappings;
import com.azure.resourcemanager.datafactory.models.MapperAttributeReference;
import com.azure.resourcemanager.datafactory.models.MapperConnection;
import com.azure.resourcemanager.datafactory.models.MapperConnectionReference;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import com.azure.resourcemanager.datafactory.models.MapperTargetConnectionsInfo;
import com.azure.resourcemanager.datafactory.models.MappingType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MapperTargetConnectionsInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperTargetConnectionsInfo model =
            BinaryData
                .fromString(
                    "{\"targetEntities\":[{\"name\":\"slzoyov\",\"properties\":{\"schema\":[{\"name\":\"qvybefg\",\"dataType\":\"x\"},{\"name\":\"kcvtl\",\"dataType\":\"seskvcuar\"},{\"name\":\"hunlpirykycnd\",\"dataType\":\"qi\"}],\"dslConnectorProperties\":[{\"name\":\"uykbbmn\",\"value\":\"datagltbxoeeo\"},{\"name\":\"lnf\",\"value\":\"datay\"},{\"name\":\"vqdbpbhfck\",\"value\":\"dataezcrcssbzhddubb\"},{\"name\":\"fblhkalehp\",\"value\":\"dataawugiqjti\"}]}},{\"name\":\"qgdm\",\"properties\":{\"schema\":[{\"name\":\"teajohiyg\",\"dataType\":\"n\"},{\"name\":\"n\",\"dataType\":\"czykmktpvw\"},{\"name\":\"csehchkhufm\",\"dataType\":\"umqy\"}],\"dslConnectorProperties\":[{\"name\":\"zulo\",\"value\":\"dataaeuzanh\"},{\"name\":\"nhsenwphpzfng\",\"value\":\"dataclid\"},{\"name\":\"u\",\"value\":\"datajj\"},{\"name\":\"wbeqrkuor\",\"value\":\"datassruqnmdvhazcvj\"}]}},{\"name\":\"iqswbqer\",\"properties\":{\"schema\":[{\"name\":\"txtd\",\"dataType\":\"kvlbpktgdstyoua\"},{\"name\":\"ewres\",\"dataType\":\"owegmmutey\"}],\"dslConnectorProperties\":[{\"name\":\"uqi\",\"value\":\"datajiitnspxlzdesygr\"},{\"name\":\"waiufanra\",\"value\":\"datafueqfrojs\"},{\"name\":\"grhydk\",\"value\":\"dataywezskiecafyg\"},{\"name\":\"xieqv\",\"value\":\"datamakli\"}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"ah\",\"parameters\":{\"tblxpkkwjdjodqhy\":\"dataalybxawoijpo\",\"mehllizhceu\":\"dataincnr\",\"ibngqladyw\":\"dataoqodkadpp\",\"ds\":\"dataxwhydtluvv\"}},\"linkedServiceType\":\"snuyemlowuowhl\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{\"name\":\"ouvblgmo\",\"value\":\"datakltrfow\"},{\"name\":\"vrfmvlihcvjd\",\"value\":\"datacrjidhftukv\"}]},\"dataMapperMappings\":[{\"targetEntityName\":\"wyojbfqzdkfnjyi\",\"sourceEntityName\":\"afr\",\"sourceConnectionReference\":{\"connectionName\":\"xmbjroum\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{\"name\":\"jrhuzgf\",\"type\":\"Aggregate\",\"functionName\":\"tpusllywp\",\"expression\":\"iotzbpdbollgryfq\",\"attributeReference\":{},\"attributeReferences\":[{},{},{},{}]}]},\"sourceDenormalizeInfo\":\"datagrowsoc\"},{\"targetEntityName\":\"quygdjboqgrmtq\",\"sourceEntityName\":\"qevadrmmw\",\"sourceConnectionReference\":{\"connectionName\":\"wvcmj\",\"type\":\"linkedservicetype\"},\"attributeMappingInfo\":{\"attributeMappings\":[{\"name\":\"scz\",\"type\":\"Aggregate\",\"functionName\":\"woqiqazugamxzkrr\",\"expression\":\"iisb\",\"attributeReference\":{},\"attributeReferences\":[{}]},{\"name\":\"ccek\",\"type\":\"Derived\",\"functionName\":\"sbezaxyfukzxuizh\",\"expression\":\"nepk\",\"attributeReference\":{},\"attributeReferences\":[{},{},{},{}]},{\"name\":\"rx\",\"type\":\"Direct\",\"functionName\":\"xdukecpxd\",\"expression\":\"v\",\"attributeReference\":{},\"attributeReferences\":[{},{}]}]},\"sourceDenormalizeInfo\":\"datamkoszudbl\"}],\"relationships\":[\"datatrpc\",\"dataqkio\",\"datakb\"]}")
                .toObject(MapperTargetConnectionsInfo.class);
        Assertions.assertEquals("slzoyov", model.targetEntities().get(0).name());
        Assertions.assertEquals("qvybefg", model.targetEntities().get(0).schema().get(0).name());
        Assertions.assertEquals("x", model.targetEntities().get(0).schema().get(0).dataType());
        Assertions.assertEquals("uykbbmn", model.targetEntities().get(0).dslConnectorProperties().get(0).name());
        Assertions.assertEquals("ah", model.connection().linkedService().referenceName());
        Assertions.assertEquals("snuyemlowuowhl", model.connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.connection().type());
        Assertions.assertEquals(false, model.connection().isInlineDataset());
        Assertions.assertEquals("ouvblgmo", model.connection().commonDslConnectorProperties().get(0).name());
        Assertions.assertEquals("wyojbfqzdkfnjyi", model.dataMapperMappings().get(0).targetEntityName());
        Assertions.assertEquals("afr", model.dataMapperMappings().get(0).sourceEntityName());
        Assertions
            .assertEquals("xmbjroum", model.dataMapperMappings().get(0).sourceConnectionReference().connectionName());
        Assertions
            .assertEquals(
                ConnectionType.LINKEDSERVICETYPE, model.dataMapperMappings().get(0).sourceConnectionReference().type());
        Assertions
            .assertEquals(
                "jrhuzgf", model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).name());
        Assertions
            .assertEquals(
                MappingType.AGGREGATE,
                model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).type());
        Assertions
            .assertEquals(
                "tpusllywp",
                model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).functionName());
        Assertions
            .assertEquals(
                "iotzbpdbollgryfq",
                model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).expression());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperTargetConnectionsInfo model =
            new MapperTargetConnectionsInfo()
                .withTargetEntities(
                    Arrays
                        .asList(
                            new MapperTable()
                                .withName("slzoyov")
                                .withSchema(
                                    Arrays
                                        .asList(
                                            new MapperTableSchema().withName("qvybefg").withDataType("x"),
                                            new MapperTableSchema().withName("kcvtl").withDataType("seskvcuar"),
                                            new MapperTableSchema().withName("hunlpirykycnd").withDataType("qi")))
                                .withDslConnectorProperties(
                                    Arrays
                                        .asList(
                                            new MapperDslConnectorProperties()
                                                .withName("uykbbmn")
                                                .withValue("datagltbxoeeo"),
                                            new MapperDslConnectorProperties().withName("lnf").withValue("datay"),
                                            new MapperDslConnectorProperties()
                                                .withName("vqdbpbhfck")
                                                .withValue("dataezcrcssbzhddubb"),
                                            new MapperDslConnectorProperties()
                                                .withName("fblhkalehp")
                                                .withValue("dataawugiqjti"))),
                            new MapperTable()
                                .withName("qgdm")
                                .withSchema(
                                    Arrays
                                        .asList(
                                            new MapperTableSchema().withName("teajohiyg").withDataType("n"),
                                            new MapperTableSchema().withName("n").withDataType("czykmktpvw"),
                                            new MapperTableSchema().withName("csehchkhufm").withDataType("umqy")))
                                .withDslConnectorProperties(
                                    Arrays
                                        .asList(
                                            new MapperDslConnectorProperties()
                                                .withName("zulo")
                                                .withValue("dataaeuzanh"),
                                            new MapperDslConnectorProperties()
                                                .withName("nhsenwphpzfng")
                                                .withValue("dataclid"),
                                            new MapperDslConnectorProperties().withName("u").withValue("datajj"),
                                            new MapperDslConnectorProperties()
                                                .withName("wbeqrkuor")
                                                .withValue("datassruqnmdvhazcvj"))),
                            new MapperTable()
                                .withName("iqswbqer")
                                .withSchema(
                                    Arrays
                                        .asList(
                                            new MapperTableSchema().withName("txtd").withDataType("kvlbpktgdstyoua"),
                                            new MapperTableSchema().withName("ewres").withDataType("owegmmutey")))
                                .withDslConnectorProperties(
                                    Arrays
                                        .asList(
                                            new MapperDslConnectorProperties()
                                                .withName("uqi")
                                                .withValue("datajiitnspxlzdesygr"),
                                            new MapperDslConnectorProperties()
                                                .withName("waiufanra")
                                                .withValue("datafueqfrojs"),
                                            new MapperDslConnectorProperties()
                                                .withName("grhydk")
                                                .withValue("dataywezskiecafyg"),
                                            new MapperDslConnectorProperties()
                                                .withName("xieqv")
                                                .withValue("datamakli")))))
                .withConnection(
                    new MapperConnection()
                        .withLinkedService(
                            new LinkedServiceReference()
                                .withReferenceName("ah")
                                .withParameters(
                                    mapOf(
                                        "tblxpkkwjdjodqhy",
                                        "dataalybxawoijpo",
                                        "mehllizhceu",
                                        "dataincnr",
                                        "ibngqladyw",
                                        "dataoqodkadpp",
                                        "ds",
                                        "dataxwhydtluvv")))
                        .withLinkedServiceType("snuyemlowuowhl")
                        .withType(ConnectionType.LINKEDSERVICETYPE)
                        .withIsInlineDataset(false)
                        .withCommonDslConnectorProperties(
                            Arrays
                                .asList(
                                    new MapperDslConnectorProperties().withName("ouvblgmo").withValue("datakltrfow"),
                                    new MapperDslConnectorProperties()
                                        .withName("vrfmvlihcvjd")
                                        .withValue("datacrjidhftukv"))))
                .withDataMapperMappings(
                    Arrays
                        .asList(
                            new DataMapperMapping()
                                .withTargetEntityName("wyojbfqzdkfnjyi")
                                .withSourceEntityName("afr")
                                .withSourceConnectionReference(
                                    new MapperConnectionReference()
                                        .withConnectionName("xmbjroum")
                                        .withType(ConnectionType.LINKEDSERVICETYPE))
                                .withAttributeMappingInfo(
                                    new MapperAttributeMappings()
                                        .withAttributeMappings(
                                            Arrays
                                                .asList(
                                                    new MapperAttributeMapping()
                                                        .withName("jrhuzgf")
                                                        .withType(MappingType.AGGREGATE)
                                                        .withFunctionName("tpusllywp")
                                                        .withExpression("iotzbpdbollgryfq")
                                                        .withAttributeReference(new MapperAttributeReference())
                                                        .withAttributeReferences(
                                                            Arrays
                                                                .asList(
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference())))))
                                .withSourceDenormalizeInfo("datagrowsoc"),
                            new DataMapperMapping()
                                .withTargetEntityName("quygdjboqgrmtq")
                                .withSourceEntityName("qevadrmmw")
                                .withSourceConnectionReference(
                                    new MapperConnectionReference()
                                        .withConnectionName("wvcmj")
                                        .withType(ConnectionType.LINKEDSERVICETYPE))
                                .withAttributeMappingInfo(
                                    new MapperAttributeMappings()
                                        .withAttributeMappings(
                                            Arrays
                                                .asList(
                                                    new MapperAttributeMapping()
                                                        .withName("scz")
                                                        .withType(MappingType.AGGREGATE)
                                                        .withFunctionName("woqiqazugamxzkrr")
                                                        .withExpression("iisb")
                                                        .withAttributeReference(new MapperAttributeReference())
                                                        .withAttributeReferences(
                                                            Arrays.asList(new MapperAttributeReference())),
                                                    new MapperAttributeMapping()
                                                        .withName("ccek")
                                                        .withType(MappingType.DERIVED)
                                                        .withFunctionName("sbezaxyfukzxuizh")
                                                        .withExpression("nepk")
                                                        .withAttributeReference(new MapperAttributeReference())
                                                        .withAttributeReferences(
                                                            Arrays
                                                                .asList(
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference())),
                                                    new MapperAttributeMapping()
                                                        .withName("rx")
                                                        .withType(MappingType.DIRECT)
                                                        .withFunctionName("xdukecpxd")
                                                        .withExpression("v")
                                                        .withAttributeReference(new MapperAttributeReference())
                                                        .withAttributeReferences(
                                                            Arrays
                                                                .asList(
                                                                    new MapperAttributeReference(),
                                                                    new MapperAttributeReference())))))
                                .withSourceDenormalizeInfo("datamkoszudbl")))
                .withRelationships(Arrays.asList("datatrpc", "dataqkio", "datakb"));
        model = BinaryData.fromObject(model).toObject(MapperTargetConnectionsInfo.class);
        Assertions.assertEquals("slzoyov", model.targetEntities().get(0).name());
        Assertions.assertEquals("qvybefg", model.targetEntities().get(0).schema().get(0).name());
        Assertions.assertEquals("x", model.targetEntities().get(0).schema().get(0).dataType());
        Assertions.assertEquals("uykbbmn", model.targetEntities().get(0).dslConnectorProperties().get(0).name());
        Assertions.assertEquals("ah", model.connection().linkedService().referenceName());
        Assertions.assertEquals("snuyemlowuowhl", model.connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.connection().type());
        Assertions.assertEquals(false, model.connection().isInlineDataset());
        Assertions.assertEquals("ouvblgmo", model.connection().commonDslConnectorProperties().get(0).name());
        Assertions.assertEquals("wyojbfqzdkfnjyi", model.dataMapperMappings().get(0).targetEntityName());
        Assertions.assertEquals("afr", model.dataMapperMappings().get(0).sourceEntityName());
        Assertions
            .assertEquals("xmbjroum", model.dataMapperMappings().get(0).sourceConnectionReference().connectionName());
        Assertions
            .assertEquals(
                ConnectionType.LINKEDSERVICETYPE, model.dataMapperMappings().get(0).sourceConnectionReference().type());
        Assertions
            .assertEquals(
                "jrhuzgf", model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).name());
        Assertions
            .assertEquals(
                MappingType.AGGREGATE,
                model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).type());
        Assertions
            .assertEquals(
                "tpusllywp",
                model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).functionName());
        Assertions
            .assertEquals(
                "iotzbpdbollgryfq",
                model.dataMapperMappings().get(0).attributeMappingInfo().attributeMappings().get(0).expression());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
