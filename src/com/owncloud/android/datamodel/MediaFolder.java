package com.owncloud.android.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scherzia on 22.09.2016.
 */

public class MediaFolder {
    public String folder;
    public String path;
    public List<String> filePaths = new ArrayList<>();
    public long numberOfFiles;
}
