package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.data.gen.UsersGenerator;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.provider.UsersJsonProvider;
import com.github.fabienrenaud.jjb.stream.UsersStreamDeserializer;
import com.github.fabienrenaud.jjb.stream.UsersStreamSerializer;

import java.io.ByteArrayOutputStream;

/**
 * Created by frenaud on 7/23/16.
 */
public class UsersSource extends JsonSource<Users> {

    private static final UsersJsonProvider usersJsonProvider = new UsersJsonProvider();

    public UsersSource(int quantity, int individualSize) {
        super(quantity, individualSize, usersJsonProvider, new UsersGenerator(), new UsersStreamSerializer(), new UsersStreamDeserializer());
    }

    @Override
    void populateFields(int quantity, int individualSize) {
        try {
            for (int i = 0; i < quantity; i++) {
                Users obj = pojoType().newInstance();
                dataGenerator.populate(obj, individualSize);
                jsonAsObject[i] = obj;

                jsonAsBytes[i] = provider.hessianSerializer().serialize(obj, new ByteArrayOutputStream());

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    Users[] newPojoArray(int quantity) {
        return new Users[quantity];
    }

    @Override
    public Class<Users> pojoType() {
        return Users.class;
    }
}
