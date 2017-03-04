package com.mobeen;

import java.util.List;

/**
 * Created by Mobeen on 3/2/2017.
 */
public interface ISaveable {
    void read(List<String> saveValues);
    List<String> write();
}
