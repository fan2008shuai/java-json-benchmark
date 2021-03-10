package com.github.fabienrenaud.jjb.provider;

import com.dslplatform.json.DslJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fabienrenaud.jjb.hessian.HessianDeserializer;
import com.github.fabienrenaud.jjb.hessian.HessianSerializer;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import org.apache.johnzon.mapper.Mapper;

import javax.json.bind.Jsonb;

import java.util.Map;

/**
 * Created by frenaud on 7/24/16.
 */
public interface JsonProvider<T> {

    Gson gson();

    HessianSerializer hessianSerializer();

    HessianDeserializer hessianDeserializer();

    ObjectMapper jackson();

    ObjectMapper jacksonAfterburner();

    JsonFactory jacksonFactory();

    javax.json.stream.JsonGeneratorFactory javaxjsonFactory();

    Genson genson();

    Jsonb yasson();

    JSONDeserializer<T> flexjsonDeser();

    JSONSerializer flexjsonSer();

    org.boon.json.ObjectMapper boon();

    Mapper johnzon();

    Map<String, Object> jsonioStreamOptions();

    DslJson<Object> dsljson();

    DslJson<Object> dsljson_reflection();

    jodd.json.JsonParser joddDeser();

    jodd.json.JsonSerializer joddSer();

    com.squareup.moshi.JsonAdapter<T> moshi();
}
