package com.muazmemis.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@BenimStereoType
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StereoTypeBean {

    private Long id;
    private String name = "Merhabalar";
    private String trade;
}
