package com.leyoumall.item.api;


import com.leyoumall.item.pojo.SpecGroup;
import com.leyoumall.item.pojo.SpecParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SpeccificationApi {
    @GetMapping("/spec/params")
    List<SpecParam> querySpecParamList(
            @RequestParam(value = "gid",required = false) Long gid,
            @RequestParam(value="cid",required = false) Long cid,
            @RequestParam(value = "searching",required = false) Boolean searching);
    @GetMapping("/spec/group")
    List<SpecGroup> queryGroupByCid(@RequestParam("cid") Long cid);
}
