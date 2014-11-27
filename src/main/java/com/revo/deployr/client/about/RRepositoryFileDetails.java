/*
 * RRepositoryFileDetails.java
 *
 * Copyright (C) 2010-2014 by Revolution Analytics Inc.
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.about;

import java.net.URL;
import java.util.Date;
import java.util.List;

/**
 * Managed repository file details.
 */
public class RRepositoryFileDetails {

    public RRepositoryFileDetails(String filename, String directory,
                                  String author, String version,
                                  String latestby, String descr, String type,
                                  int size, URL url, String access,
                                  String restricted, boolean shared, boolean published,
                                  List<String> authors, String inputs, String outputs,
                                  String tags, String category,
                                  String md5, Date lastModified) {
        this.filename = filename;
        this.directory = directory;
        this.author = author;
        this.version = version;
        this.latestby = latestby;
        this.descr = descr;
        this.type = type;
        this.size = size;
        this.access = access;
        this.restricted = restricted;
        this.shared = shared;
        this.published = published;
        this.authors = authors;
        this.inputs = inputs;
        this.outputs = outputs;
        this.tags = tags;
        this.category = category;
        this.md5 = md5;
        this.lastModified = lastModified;
    }

    /**
     * Repository file name.
     */
    public final String filename;

    /**
     * Repository file directory.
     */
    public final String directory;

    /**
     * Repository file author.
     */
    public final String author;

    /**
     * Repository file version.
     */
    public final String version;

    /**
     * Repository file latest version author.
     */
    public final String latestby;

    /**
     * Repository file description.
     */
    public final String descr;

    /**
     * Repository file mime type.
     */
    public final String type;

    /**
     * Repository file size.
     */
    public final int size;

    /**
     * Repository file access level display-friendly description:
     * Private, Restricted, Shared, Public.
     */
    public final String access;

    /**
     * Repository file access is restricted to authenticated
     * user with the ROLE(s) indicated.
     */
    public final String restricted;

    /**
     * Repository file access is shared to all authenticated
     * users.
     */
    public final boolean shared;

    /**
     * Repository file access is public, visible to all
     * authenticated and anonymous users.
     */
    public final boolean published;

    /**
     * Repository file authors.
     */
    public final List<String> authors;

    /**
     * Repository file (script) inputs.
     */
    public final String inputs;

    /**
     * Repository file (script) outputs.
     */
    public final String outputs;

    /**
     * Repository file tags.
     */
    public final String tags;

    /**
     * Repository file category.
     */
    public final String category;

    /**
     * Repository file md5 checksum.
     */
    public final String md5;

    /**
     * Repository file last modified date.
     */
    public final Date lastModified;

}
