package com.lb.pattern.template;

import org.junit.Test;

/**
 * @author lb
 * @Title: TemplateTest
 * @Description: TODO
 * @date 2018/09/12  11:10
 */
public class TemplateTest {
    @Test
    public void testTemplatePattern(){
        CookTemplate cookEggAndTomato = new EggAndTomato();
        cookEggAndTomato.doDish();
        CookTemplate cookVivaLaGloria = new VivaLaGloria();
        cookVivaLaGloria.doDish();
    }
}
