package com.github.fabienrenaud.jjb.hessian;

import com.caucho.hessian.io.Hessian2Input;

import java.io.IOException;
import java.io.InputStream;

public class HessianDeserializer {

    public Object deserializer(InputStream inputStream) throws IOException {
        Hessian2Input hessian2Input = new Hessian2Input(inputStream);
        Object object = hessian2Input.readObject();
        hessian2Input.close();
        return object;
    }

}
