package com.rajabi.second.application.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by shubham on 3/4/17.
 */

public class NotesMetaData {

        public NotesMetaData() {

        }

        // A content URI is a URI that identifies data in a provider. Content URIs
        // include the symbolic name of the entire provider (its authority)
        public static final String AUTHORITY = "com.rajabi.second.firstapplication.notescontentprovider";
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY
                + "/notes");

        public static final String DATABASE_NAME = "notes.db";
        public static final int DATABASE_VERSION = 1;

        public static final String CONTENT_TYPE_NOTES_ALL = "vnd.android.cursor.dir/vnd.example.shubham.notes";
        public static final String CONTENT_TYPE_NOTES_ONE = "vnd.android.cursor.item/vnd.example.shubham.notes";

        public class NotesTable implements BaseColumns {

            private NotesTable() {

            }

            public static final String TABLE_NAME = "notes";

            public static final String ID = "_id";
            public static final String TITLE = "title";
            public static final String CONTENT = "content";
        }

    }