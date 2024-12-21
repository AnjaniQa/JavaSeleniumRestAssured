package Interview;

/*
DataSet1
cluster1 clustername1
cluster2 clustername2

DataSet2
server1 cluster1
server2 cluster1
server3 cluster2
server4 cluster2


Expected output:

clustername1
server 1
server 2

clustername2
server 3
server 4
 */

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.apache.http.RequestLine;

import java.util.ArrayList;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<DataSet1> datalist1 = new ArrayList<>();
        datalist1.add(new DataSet1("cluster 1", "clustername1"));
        datalist1.add(new DataSet1("cluster 2", "clustername2"));
        datalist1.add(new DataSet1("cluster 3", "clustername3"));

        ArrayList<DataSet2> datalist2 = new ArrayList<>();
        datalist2.add(new DataSet2("server1", "cluster 1"));
        datalist2.add(new DataSet2("server2", "cluster 1"));
        datalist2.add(new DataSet2("server3", "cluster 2"));
        datalist2.add(new DataSet2("server4", "cluster 2"));
        datalist2.add(new DataSet2("server5", "cluster 3"));

        for(DataSet1 data1 : datalist1) {
            System.out.println(data1.clusterName);
                for(DataSet2 data2 : datalist2) {
                    if(data1.cluster.equals(data2.cluster)) {
                        System.out.println(data2.server);
                    }
                }
        }

    }




}
