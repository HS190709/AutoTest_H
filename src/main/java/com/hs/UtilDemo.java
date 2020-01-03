package com.hs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author HS
 * @date 2020/01/03 23:59:16
 **/
public class UtilDemo {
    public static void main(String[] args) {
        UtilDemo util = new UtilDemo();
        try {
            util.seach(util.diff(util.stringToDate(util.readData("start")), util.stringToDate(util.readData("end"))), util.diff(util.stringToDate(util.readData("started")), util.stringToDate(util.readData("ended"))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> readData(String name) throws IOException {
        List<String> list = new ArrayList<>();
        String element = null;
        File file = new File("C:/Users/HS/Desktop/" + name + ".txt");
        if (file.isFile() && file.exists()) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((element = br.readLine()) != null) {
                list.add(element);
            }
            if (element != null) {
                br.close();
                fr.close();
            }
        } else {
            System.out.println("找不到指定文件！" + name);
        }

        return list;
    }

    public List<Date> stringToDate(List<String> name) throws ParseException {
        List<Date> list = new ArrayList<>();
        Date date = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0; i < name.size(); i++) {
            date = df.parse(name.get(i));
            list.add(date);
        }
        return list;
    }

    public List<Long> diff(List<Date> start, List<Date> end) {
        List<Long> list = new ArrayList<>();
        Long diff = null;
        for (int i = 0; i < start.size(); i++) {
            diff = (end.get(i).getTime() - start.get(i).getTime()) / (1000 * 60);
            list.add(diff);
        }
        return list;
    }

    public void seach(List<Long> plan, List<Long> actual) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < plan.size(); i++) {
            if (actual.get(i) - plan.get(i) > 30 && actual.get(i) - plan.get(i) < 2400) {
                list.add(i);
            }
        }
        if (list.size() > 0) {
            System.out.println(list);
        } else {
            System.out.println("没有符合的数据");
        }
    }
}
