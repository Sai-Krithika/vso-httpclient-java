// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.ArrayList;

/** 
 */
public class BoardFilterSettings {

    private FilterModel criteria;
    private ArrayList<Integer> parentWorkItemIds;
    private String queryText;

    public FilterModel getCriteria() {
        return criteria;
    }

    public void setCriteria(final FilterModel criteria) {
        this.criteria = criteria;
    }

    public ArrayList<Integer> getParentWorkItemIds() {
        return parentWorkItemIds;
    }

    public void setParentWorkItemIds(final ArrayList<Integer> parentWorkItemIds) {
        this.parentWorkItemIds = parentWorkItemIds;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(final String queryText) {
        this.queryText = queryText;
    }
}
