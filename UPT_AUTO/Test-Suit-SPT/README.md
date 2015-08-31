1. The Jenkins Job -----> Goals and options:
clean -Dmaven.clean.failOnError=false gatling:execute

2. <!-- The Gatling maven plugin -->
            <plugin>
                <groupId>io.gatling</groupId>
                <artifactId>gatling-maven-plugin</artifactId>
                <version>${Gatling.verion}</version>
                <configuration>
                    <simulationsFolder>src\test\scala</simulationsFolder>
                    <includes>
                        <include>com.jd.leo.SPT_Auto.Demo.spt_demo</include>
                    </includes>
                </configuration>
                <executions>
                    <execution>
                        <phase>test</phase>
                        <goals>
                            <goal>execute</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

The tags <simulationsFolder> and <include> should be pay attention, if the tag <simulationsFolder> is like "src\test\java",
then the Gatling compiler Zinc will try to compile all files under the src\test\java which may cause the Jenkins build failure!!!

