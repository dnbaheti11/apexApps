package com.example.TestPartitioning;

import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.common.util.BaseOperator;

/**
 * Created by bhupesh on 22/8/17.
 */
public class RESTResponseOperator extends BaseOperator
{

  public transient DefaultInputPort<Double> input1 = new DefaultInputPort<Double>()
  {
    @Override
    public void process(Double tuple)
    {

    }
  };

  public transient DefaultInputPort<Double> input2 = new DefaultInputPort<Double>()
  {
    @Override
    public void process(Double tuple)
    {

    }
  };

  public transient DefaultOutputPort<Double> output = new DefaultOutputPort<>();

}