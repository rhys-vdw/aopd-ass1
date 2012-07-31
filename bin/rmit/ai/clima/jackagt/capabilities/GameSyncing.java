/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.capabilities;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.jackagt.data.SimulationProp;
import aos.util.timer.Timer;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.jackagt.events.EStart;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.MEGameEnd;
import rmit.ai.clima.iface.PerceiveClimaServer;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.iface.TellClimaServer;
import rmit.ai.clima.jackagt.plans.AuthenticateToServer;
import rmit.ai.clima.jackagt.plans.FinishGame;
import rmit.ai.clima.jackagt.plans.StartSimulation;
import rmit.ai.clima.jackagt.plans.FinishSimulation;

//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;

public class GameSyncing extends aos.jack.jak.agent.Capability {
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public aos.util.timer.Timer clima_timer_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.jackagt.events.MESimEnd mesimend_s;
    public rmit.ai.clima.jackagt.events.MEGameEnd megameend_s;
    public rmit.ai.clima.jackagt.events.MEInformCellStatus meinformcellstatus_s;
    public rmit.ai.clima.jackagt.events.MESimStart mesimstart_s;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.iface.TellClimaServer tellclimaserver_p;
    public java.lang.String getDocumentation()
    {
        return "//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n";
    }
    
    public void __init1()
    {
        setNamedCreator("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_simulationProp_dat();
            }
            
        },true);
        setNamedCreator("clima_timer_dat","aos.util.timer.Timer",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_clima_timer_dat();
            }
            
        },true);
        setNamedCreator("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentRequestActionId_dat();
            }
            
        },true);
        setNamedCreator("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_cellEmpty_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        clima_timer_dat = (aos.util.timer.Timer) getNamedObject("clima_timer_dat","aos.util.timer.Timer");
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) getNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty");
        mesimend_s = (rmit.ai.clima.jackagt.events.MESimEnd) findEvent("rmit.ai.clima.jackagt.events.MESimEnd");
        megameend_s = (rmit.ai.clima.jackagt.events.MEGameEnd) findEvent("rmit.ai.clima.jackagt.events.MEGameEnd");
        meinformcellstatus_s = (rmit.ai.clima.jackagt.events.MEInformCellStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus");
        mesimstart_s = (rmit.ai.clima.jackagt.events.MESimStart) findEvent("rmit.ai.clima.jackagt.events.MESimStart");
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        tellclimaserver_p = (rmit.ai.clima.iface.TellClimaServer) findEvent("rmit.ai.clima.iface.TellClimaServer");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("rmit.ai.clima.iface.TellClimaServer","rmit.ai.clima.iface.TellClimaServer");
        externals.put("rmit.ai.clima.iface.PerceiveClimaServer","rmit.ai.clima.iface.PerceiveClimaServer");
        externals.put("rmit.ai.clima.jackagt.events.EStart","rmit.ai.clima.jackagt.events.EStart");
        externals.put("bel_cellEmpty_dat","bel_cellEmpty_dat");
        externals.put("bel_currentRequestActionId_dat","bel_currentRequestActionId_dat");
        externals.put("clima_timer_dat","clima_timer_dat");
        externals.put("bel_simulationProp_dat","bel_simulationProp_dat");
        addEvent("rmit.ai.clima.jackagt.events.EStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEGameEnd",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.iface.PerceiveClimaServer",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.iface.TellClimaServer",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.AuthenticateToServer",0);
        addPlan("rmit.ai.clima.jackagt.plans.FinishGame",0);
        addPlan("rmit.ai.clima.jackagt.plans.StartSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.FinishSimulation",0);
    }
    
    public GameSyncing(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("rmit.ai.clima.jackagt.plans.AuthenticateToServer");
        __bindToPlan("rmit.ai.clima.jackagt.plans.FinishGame");
        __bindToPlan("rmit.ai.clima.jackagt.plans.StartSimulation");
        __bindToPlan("rmit.ai.clima.jackagt.plans.FinishSimulation");
    }
    
    private rmit.ai.clima.jackagt.data.SimulationProp __named_data_bel_simulationProp_dat()
    {
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        return bel_simulationProp_dat;
    }
    
    private aos.util.timer.Timer __named_data_clima_timer_dat()
    {
        clima_timer_dat = (aos.util.timer.Timer) getNamedObject("clima_timer_dat","aos.util.timer.Timer");
        return clima_timer_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentRequestActionId __named_data_bel_currentRequestActionId_dat()
    {
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        return bel_currentRequestActionId_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CellEmpty __named_data_bel_cellEmpty_dat()
    {
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) getNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty");
        return bel_cellEmpty_dat;
    }
    
}
