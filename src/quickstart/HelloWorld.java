package quickstart;
import com.eebbk.encrypt.base.algorithm.DESCoder;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) throws Exception{
        List<String> decodeList = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        list.add("0yqVvlx4UnQk0p34g96CKg==");
        list.add("0yqVvlx4UnQk0p34g96CKg==");

        for(String id :list){
            System.out.println(id);
            decodeList.add(DESCoder.decrypt(id, "eeBBK@52"));
            System.out.println(decodeList);
        }

    }
}