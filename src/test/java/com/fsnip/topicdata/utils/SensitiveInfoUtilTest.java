package com.fsnip.topicdata.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/27.
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class SensitiveInfoUtilTest
{
   // @Test
    public void address()
        throws Exception
    {
        String address="贵州省-黔东南苗族侗族自治州-凯里市-贵州省凯里经济开发区鸭塘中学内";
        String address1="贵州省-铜仁地区-江口县-商业街";
        String address2="贵州省-遵义市-余庆县-松烟镇他山路1号";
        String address3="贵州省-贵阳市-修文县-龙场镇虎山路53、55、57号";
        String address4="贵州省-遵义市-仁怀市-茅台镇上坪村";
        String address5="贵州省-贵阳市-云岩区-黔灵镇沙河村小石城枫园第（161）栋3单元5楼1号";
        System.out.println("\"\": " + SensitiveInfoUtils.address("",6));
        System.out.println("贵州省-黔东南苗族侗族自治州-凯里市-贵州省凯里经济开发区鸭塘中学内: " + SensitiveInfoUtils.address(address,6));
        System.out.println("贵州省-铜仁地区-江口县-商业街: " + SensitiveInfoUtils.address(address1,6));
        System.out.println("贵州省-遵义市-余庆县-松烟镇他山路1号: " + SensitiveInfoUtils.address(address2,6));
        System.out.println("贵州省-贵阳市-修文县-龙场镇虎山路53、55、57号: " + SensitiveInfoUtils.address(address3,6));
        System.out.println("贵州省-遵义市-仁怀市-茅台镇上坪村:" + SensitiveInfoUtils.address(address4,6));
        System.out.println("贵州省-贵阳市-云岩区-黔灵镇沙河村小石城枫园第（161）栋3单元5楼1号: " + SensitiveInfoUtils.address(address5,6));
    }

    @Test
    public void idCard()
        throws Exception
    {
        String card="522501197510056565";
        String card1="522222000027720（1-1）";
        String card2="520100400159182";
        String card3="91520103MA6DK0H31H";
        String card4="91520900MA6DJE2C24";
        String card5="9152263670958455xl";
        System.out.println("\"\": " + SensitiveInfoUtils.idCard(""));
        System.out.println("522501197510056565: " + SensitiveInfoUtils.idCard(card));
        System.out.println("522222000027720（1-1）: " + SensitiveInfoUtils.idCard(card1));
        System.out.println("520100400159182: " + SensitiveInfoUtils.idCard(card2));
        System.out.println("91520103MA6DK0H31H: " + SensitiveInfoUtils.idCard(card3));
        System.out.println("91520900MA6DJE2C24: " + SensitiveInfoUtils.idCard(card4));
        System.out.println("9152263670958455xl: " + SensitiveInfoUtils.idCard(card5));
    }

   // @Test
    public void mobilePhone()
        throws Exception
    {
        String mobliePhone="13984244848";
        String mobliePhone1="18216562181";
        String mobliePhone2="15286280338";
        String mobliePhone3="13984580";
        String mobliePhone4="18386327930";
        String mobliePhone5="028-645817";
        String mobliePhone6="00313984244848";
        System.out.println("\"\": " + SensitiveInfoUtils.mobilePhone(""));
        System.out.println("13984244848: " + SensitiveInfoUtils.mobilePhone(mobliePhone));
        System.out.println("18216562181: " + SensitiveInfoUtils.mobilePhone(mobliePhone1));
        System.out.println("15286280338: " + SensitiveInfoUtils.mobilePhone(mobliePhone2));
        System.out.println("13984580: " + SensitiveInfoUtils.mobilePhone(mobliePhone3));
        System.out.println("18386327930: " + SensitiveInfoUtils.mobilePhone(mobliePhone4));
        System.out.println("028-645817: " + SensitiveInfoUtils.mobilePhone(mobliePhone5));
        System.out.println("00313984244848: " + SensitiveInfoUtils.mobilePhone(mobliePhone6));
    }

   // @Test
    public void email()
    {
        String email="adadqeq@qq.com";
        String email1="q@qq.com";
        String email2="@qq.com";
        String email3="4414432131@qq.com";
        String email4="14145113@qq.com";
        String email5="3131d313131@31131@qq.com";
        System.out.println("\"\": " + SensitiveInfoUtils.email(""));
        System.out.println("adadqeq@qq.com: " + SensitiveInfoUtils.email(email));
        System.out.println("q@qq.com: " + SensitiveInfoUtils.email(email1));
        System.out.println("@qq.com: " + SensitiveInfoUtils.email(email2));
        System.out.println("4414432131@qq.com: " + SensitiveInfoUtils.email(email3));
        System.out.println("14145113@qq.com: " + SensitiveInfoUtils.email(email4));
        System.out.println("3131d313131@31131@qq.com: " + SensitiveInfoUtils.email(email5));
    }
}