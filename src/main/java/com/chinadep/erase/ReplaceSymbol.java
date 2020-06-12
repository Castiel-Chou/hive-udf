package com.chinadep.erase;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * @ClassName: ReplaceSymbol
 * @Description: TODO
 * @Author: Jokey Zhou
 * @Date: 2020/6/12 15:31
 * @赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ReplaceSymbol extends UDF {
    public String evaluate(final String s) {
        String replace = s.replace("\u0001", "&")
                .replace("\u0002", ",")
                .replace("\u000B", "&")
                .replace("\u000C", ",");

        return replace;
    }
}
