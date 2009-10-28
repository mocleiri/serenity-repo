package com.ikokoon.persistence;

import org.junit.Test;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.OdbConfiguration;

public class DataBaseDump {

	@Test
	public void dump() {
		// File file = new File("C:/Eclipse/workspace/serenity/serenity/serenity.db");
		// IDataBase dataBase = IDataBase.DataBase.getDataBase(file.getAbsolutePath());
		// Project project = (Project) dataBase.find(Toolkit.hash(Project.class.getName()));
		// logger.info(project);
		// dataBase = (ADataBase) IDataBase.DataBase.getDataBase();

		OdbConfiguration.setDebugEnabled(true);
		OdbConfiguration.setAutomaticCloseFileOnExit(true);
		OdbConfiguration.setDisplayWarnings(true);

		ODB odb = ODBFactory.open("C:/Eclipse/workspace/serenity/serenity/serenity.db");
		Dummy dummy = new Dummy();
		odb.store(dummy);
		odb.commit();

		Objects<Dummy> objects = odb.getObjects(Dummy.class);
		for (Dummy object : objects) {
			System.out.println(object);
		}

		odb.close();
	}

}
