/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sharath.module2.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Sharath Kulal
 */
public class Module2ServiceTest {
    
    @Test
    public void test() {
        Module2Service service = new Module2Service();
        assertThat(service.ping(), is("ok"));
    }
}
