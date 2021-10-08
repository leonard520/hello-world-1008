/*
 * Copyright 2018-Present The CloudEvents Authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.cloudevents.examples.springboot;

import static io.cloudevents.core.CloudEventUtils.mapData;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cloudevents.CloudEvent;
import io.cloudevents.core.data.PojoCloudEventData;
import io.cloudevents.jackson.PojoCloudEventDataMapper;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/")
public class MainResource {

    private static List<String> messages = new LinkedList<>();

    @Autowired
    ObjectMapper objectMapper;

    @POST
    public String handleSNSEvent(CloudEvent inputEvent) {
        PojoCloudEventData<SnsMessage> cloudEventData = mapData(inputEvent, PojoCloudEventDataMapper.from(objectMapper, SnsMessage.class));
        String value = cloudEventData.getValue().toString();
        messages.add(inputEvent.toString());
        return value;
    }

    @GET
    @Path("sns")
    public String showSNSEvent() {
        return Arrays.toString(messages.toArray());
    }
}
