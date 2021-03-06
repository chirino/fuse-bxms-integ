Introduction
============
This quickstart demonstrates the usage of a rules service in conjunction with a camel service, creating a Content-Based Router.
This quickstart also demonstrates the ability to use MVEL expressions to extract objects (the Widgets from their Boxes) and insert them as facts inside the rules engine.
The drl resource is specified using annotations within the DestinationServiceRules interface, and checks the id of Widgets to determine the destination to set on their Boxes.
Then, a Camel route looks at the destination set on the Box for each Widget, and routes it to the appropriate service (RedService, GreenService, or BlueService).

If you would like to watch the rules execution, uncomment these lines in
src/main/resources/META-INF/switchyard.xml:
<rules:listeners>
    <rules:listener class="org.kie.api.event.rule.DebugAgendaEventListener"/>
    <rules:listener class="org.kie.api.event.rule.DebugRuleRuntimeEventListener"/>
</rules:listeners>

![Rules Camel CBR Quickstart](https://github.com/jboss-switchyard/quickstarts/raw/master/rules-camel-cbr/rules-camel-cbr.jpg)


Preqrequisites 
==============
Maven

Running the quickstart
======================


EAP
----------
1. Start JBoss AS 7 in standalone mode:

        ${AS}/bin/standalone.sh

2. Build and deploy the Quickstart :

        mvn install -Pdeploy

3. Use the RulesCamelCBRClient class to send a request message to the Dealer service.  The client can be
   run from the command-line using:

        mvn exec:java

See the "Expected Output" section for the expected results.

4. Undeploy the quickstart:

        mvn clean -Pdeploy

FUSE
----------
1. Start Fuse:

${FUSE_HOME}/bin/karaf


2. Ensure that the drools and switchyard compatible features URL files have been added to your Fuse instance. 
   In case they are not added then:

    features:addurl mvn:org.switchyard.karaf/switchyard/${version.switchyard}/xml/features
    features:addurl mvn:org.drools/drools-karaf-features/${version.org.kie}/xml/features


3. Add the features URL for the respective version of BXMS.   Replace {FUSE_BXMS_VERSION}
with the version of Fuse BXMS Integration that you are using (ex. 1.0.0): 

JBossFuse:karaf@root> features:addurl mvn:org.jboss.integration.fuse.quickstarts/karaf-features/${FUSE_BXMS_VERSION}/xml/features

4. Install the feature for the Rules Camel CBR quickstart :

JBossFuse:karaf@root> features:install fuse-bxms-switchyard-quickstart-rules-camel-cbr

5. To submit a webservice request to invoke the SOAP gateway, run the quickstart client :
<br/>
```
mvn exec:java -Pkaraf
```
<br/>

6. Check the log for the expected results :

karaf@root> log:display 


7. Undeploy the quickstart:

JBossFuse:karaf@root> features:uninstall fuse-bxms-switchyard-quickstart-rules-camel-cbr


KARAF
----------
1. Start the Karaf server :

${KARAF_HOME}/bin/karaf


2. Ensure that the drools and switchyard compatible features URL files have been added to your Karaf instance. 
   In case they are not added then:

    features:addurl mvn:org.switchyard.karaf/switchyard/${version.switchyard}/xml/features
    features:addurl mvn:org.drools/drools-karaf-features/${version.org.kie}/xml/features


3. Add the features URL for the respective version of BXMS.   Replace {FUSE_BXMS_VERSION}
with the version of Fuse BXMS Integration that you are using (ex. 1.0.0): 

karaf@root> features:addurl mvn:org.jboss.integration.fuse.quickstarts/karaf-features/${FUSE_BXMS_VERSION}/xml/features

4. Install the feature for the Rules Camel CBR quickstart :

karaf@root> features:install fuse-bxms-switchyard-quickstart-rules-camel-cbr

5. To submit a webservice request to invoke the SOAP gateway, run the quickstart client :
<br/>
```
mvn exec:java -Pkaraf
```
<br/>

6. Check the log for the expected results :

karaf@root> log:display 


7. Undeploy the quickstart:

karaf@root> features:uninstall fuse-bxms-switchyard-quickstart-rules-camel-cbr


Expected Output
======================
```
13:52:09,079 INFO  [org.switchyard.quickstarts.rules.camel.cbr.RedServiceBean] (http-/127.0.0.1:8080-1) Red service processing boxed widget with id: FF0000-ABC-123
```


## Further Reading

1. [Configuration Documentation](https://docs.jboss.org/author/display/SWITCHYARD/Configuration)
2. [Rules Services Documentation](https://docs.jboss.org/author/display/SWITCHYARD/Rules)
3. [Camel Services Documentation](https://docs.jboss.org/author/display/SWITCHYARD/Camel)
4. [Bean Services Documentation](https://docs.jboss.org/author/display/SWITCHYARD/Bean)
