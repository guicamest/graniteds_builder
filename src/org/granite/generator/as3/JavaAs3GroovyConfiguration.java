/*
  GRANITE DATA SERVICES
  Copyright (C) 2011 GRANITE DATA SERVICES S.A.S.

  This file is part of Granite Data Services.

  Granite Data Services is free software; you can redistribute it and/or modify
  it under the terms of the GNU Library General Public License as published by
  the Free Software Foundation; either version 2 of the License, or (at your
  option) any later version.

  Granite Data Services is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the GNU Library General Public License
  for more details.

  You should have received a copy of the GNU Library General Public License
  along with this library; if not, see <http://www.gnu.org/licenses/>.
*/

package org.granite.generator.as3;

import java.io.File;
import java.util.List;

import org.granite.generator.TemplateUri;
import org.granite.generator.as3.reflect.JavaType.Kind;
import org.granite.generator.gsp.GroovyConfiguration;

/**
 * @author Franck WOLFF
 */
public interface JavaAs3GroovyConfiguration extends GroovyConfiguration {

	public String getUid();
	public boolean isGenerated(Class<?> clazz);
    
	public As3TypeFactory getAs3TypeFactory();
    public List<PackageTranslator> getTranslators();
	public EntityFactory getEntityFactory();
	public RemoteDestinationFactory getRemoteDestinationFactory();
    
    public TemplateUri[] getTemplateUris(Kind kind, Class<?> clazz);
    
    public File getOutputDir(JavaAs3Input input);
    public File getBaseOutputDir(JavaAs3Input input);
}
