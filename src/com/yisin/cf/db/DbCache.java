package com.yisin.cf.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yisin.cf.entity.DbTable;
import com.yisin.cf.entity.DbTableColumn;

public class DbCache {

	public static List<DbTable> mysqlDbTableList = new ArrayList<DbTable>();

	public static Map<String, List<DbTableColumn>> mysqlDbColumnMap = new HashMap<String, List<DbTableColumn>>();

}
