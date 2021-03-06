/*
 *  Modifications Copyright (c) 2017-2021 Uber Technologies Inc.
 *  Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"). You may not
 *  use this file except in compliance with the License. A copy of the License is
 *  located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package com.uber.cadence.internal.shadowing;

import java.util.List;

/**
 * This class is the JSON serializable class of {@link
 * com.uber.cadence.shadower.ReplayWorkflowActivityParams} Make sure this class is sync with auto
 * generated ReplayWorkflowActivityParams
 */
public class ReplayWorkflowActivityParams {
  private String domain;
  private List<WorkflowExecution> executions;

  public ReplayWorkflowActivityParams() {}

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public List<WorkflowExecution> getExecutions() {
    return executions;
  }

  public void setExecutions(List<WorkflowExecution> executions) {
    this.executions = executions;
  }

  @Override
  public String toString() {
    return "ReplayWorkflowActivityParams{"
        + "domain='"
        + domain
        + '\''
        + ", executions="
        + executions
        + '}';
  }
}
