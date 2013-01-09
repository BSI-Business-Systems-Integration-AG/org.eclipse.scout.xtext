/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutProject;

import com.google.inject.Injector;

/**
 * <h3>{@link SamlContext}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlContext {
  private final IProgressMonitor m_monitor;
  private final IWorkingCopyManager m_workingCopyManager;
  private final Injector m_injector;
  private final SamlGrammarAccess m_grammarAccess;
  private final IScoutProject m_rootProject;
  private IScoutProject m_currentScoutModule;

  public SamlContext(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, Injector injector, IScoutProject rootProject) {
    m_monitor = monitor;
    m_workingCopyManager = workingCopyManager;
    m_injector = injector;
    m_rootProject = rootProject;
    m_grammarAccess = m_injector.getInstance(SamlGrammarAccess.class);
  }

  public IScoutProject getCurrentScoutModule() {
    return m_currentScoutModule;
  }

  public void setCurrentScoutModule(IScoutProject currentScoutModule) {
    m_currentScoutModule = currentScoutModule;
  }

  public Injector getInjector() {
    return m_injector;
  }

  public IProgressMonitor getMonitor() {
    return m_monitor;
  }

  public IWorkingCopyManager getWorkingCopyManager() {
    return m_workingCopyManager;
  }

  public SamlGrammarAccess getGrammarAccess() {
    return m_grammarAccess;
  }

  public IScoutProject getRootProject() {
    return m_rootProject;
  }
}
