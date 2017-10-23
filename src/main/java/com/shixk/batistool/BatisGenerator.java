///*******************************************************************************
// * 项目名称   ： sharding2
// * 文件名    ： BatisGenerator
// *
// * @copyright Copyright 2014-2016 联想(北京)有限公司 All Right Reserved.
// * *****************************************************************************
// * 注意： 本内容仅限于联想(北京)有限公司内部使用，禁止转发
// ******************************************************************************/
package com.shixk.batistool;
//
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title: BatisGenerator
 * @Package com.lenovo.qimen.common
 * @Description: (用一句话描述该文件做什么)
 * @Author zhangyj21(zhangyj21@lenovo.com)
 * @Date 2016-11-04 14:44
 * @Version V1.0
 */
public class BatisGenerator {
    public static void main(String[] args) throws Exception {
        try {
            BatisGenerator batisGenerator = new BatisGenerator();
            batisGenerator.generate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void generate() throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        File configFile = new File("src/main/resources/batisGeneratorConfigVorak.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }
}



