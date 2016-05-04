package com.whammich.sstow.util;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import net.minecraft.util.math.BlockPos;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class PosWithStack {

    private final BlockPos pos;
    private final BlockStack block;
}
