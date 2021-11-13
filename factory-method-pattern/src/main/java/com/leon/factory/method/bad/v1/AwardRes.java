package com.leon.factory.method.bad.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardRes {
    private String code; // 编码
    private String info; // 描述
}
