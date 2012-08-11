/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.capabilities;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.jackagt.data.CurrentStatus;
import rmit.ai.clima.jackagt.data.CurrentPosition;
import rmit.ai.clima.iface.LastActionSentBel;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.jackagt.events.ECellChange;
import rmit.ai.clima.jackagt.events.EShowBeliefs;
import rmit.ai.clima.jackagt.events.EExecuteCLIMAaction;
import rmit.ai.clima.iface.TellClimaServer;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.EAct;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.iface.PerceiveClimaServer;
import rmit.ai.clima.jackagt.plans.SendActionAndWait;
import rmit.ai.clima.jackagt.plans.UpdateCellsAround;
import rmit.ai.clima.jackagt.plans.HandlePercept;
import java.lang.Object;

public class GamePlaying extends aos.jack.jak.agent.Capability {
    public rmit.ai.clima.jackagt.data.CurrentStatus bel_currentStatus_dat;
    public rmit.ai.clima.jackagt.data.CurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.iface.LastActionSentBel bel_lastActionSent_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.jackagt.capabilities.InfoReporting inforeporting_cap;
    public rmit.ai.clima.jackagt.capabilities.ActionDecision actiondecision_cap;
    public rmit.ai.clima.jackagt.events.EShowBeliefs eshowbeliefs_p;
    public rmit.ai.clima.jackagt.events.EExecuteCLIMAaction eexecuteclimaaction_p;
    public rmit.ai.clima.iface.TellClimaServer tellclimaserver_p;
    public rmit.ai.clima.jackagt.events.EUpdateBel eupdatebel_s;
    public rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_s;
    public rmit.ai.clima.jackagt.events.MEInformCellStatus meinformcellstatus_s;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public void __init1()
    {
        setNamedCreator("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentStatus_dat();
            }
            
        },true);
        setNamedCreator("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentPosition_dat();
            }
            
        },true);
        setNamedCreator("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_lastActionSent_dat();
            }
            
        },true);
        setNamedCreator("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_simulationProp_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
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
        if (inforeporting_cap == null) {
            inforeporting_cap = new rmit.ai.clima.jackagt.capabilities.InfoReporting(this);
            inforeporting_cap.__initCapability(this,"inforeporting_cap");
        }
        inforeporting_cap.__init1();
        if (actiondecision_cap == null) {
            actiondecision_cap = new rmit.ai.clima.jackagt.capabilities.ActionDecision(this);
            actiondecision_cap.__initCapability(this,"actiondecision_cap");
        }
        actiondecision_cap.__init1();
    }
    
    public void __init2()
    {
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.CurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition");
        bel_lastActionSent_dat = (rmit.ai.clima.iface.LastActionSentBel) getNamedObject("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel");
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) getNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty");
        eshowbeliefs_p = (rmit.ai.clima.jackagt.events.EShowBeliefs) findEvent("rmit.ai.clima.jackagt.events.EShowBeliefs");
        eexecuteclimaaction_p = (rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) findEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction");
        tellclimaserver_p = (rmit.ai.clima.iface.TellClimaServer) findEvent("rmit.ai.clima.iface.TellClimaServer");
        eupdatebel_s = (rmit.ai.clima.jackagt.events.EUpdateBel) findEvent("rmit.ai.clima.jackagt.events.EUpdateBel");
        meinformagentstatus_s = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        meinformcellstatus_s = (rmit.ai.clima.jackagt.events.MEInformCellStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus");
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        inforeporting_cap.__init2();
        actiondecision_cap.__init2();
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("rmit.ai.clima.iface.PerceiveClimaServer","rmit.ai.clima.iface.PerceiveClimaServer");
        externals.put("rmit.ai.clima.jackagt.events.EAct","rmit.ai.clima.jackagt.events.EAct");
        externals.put("rmit.ai.clima.iface.TellClimaServer","rmit.ai.clima.iface.TellClimaServer");
        externals.put("rmit.ai.clima.jackagt.events.ECellChange","rmit.ai.clima.jackagt.events.ECellChange");
        externals.put("bel_cellEmpty_dat","bel_cellEmpty_dat");
        externals.put("bel_currentRequestActionId_dat","bel_currentRequestActionId_dat");
        externals.put("bel_goldAt_dat","bel_goldAt_dat");
        externals.put("bel_simulationProp_dat","bel_simulationProp_dat");
        externals.put("bel_lastActionSent_dat","bel_lastActionSent_dat");
        externals.put("bel_currentPosition_dat","bel_currentPosition_dat");
        externals.put("bel_currentStatus_dat","bel_currentStatus_dat");
        inforeporting_cap = new rmit.ai.clima.jackagt.capabilities.InfoReporting(this);
        inforeporting_cap.__initCapability(this,"inforeporting_cap");
        inforeporting_cap.init_desc();
        actiondecision_cap = new rmit.ai.clima.jackagt.capabilities.ActionDecision(this);
        actiondecision_cap.__initCapability(this,"actiondecision_cap");
        actiondecision_cap.init_desc();
        addEvent("rmit.ai.clima.jackagt.events.ECellChange",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EShowBeliefs",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EShowBeliefs",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.iface.TellClimaServer",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EUpdateBel",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EAct",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.iface.PerceiveClimaServer",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.SendActionAndWait",0);
        addPlan("rmit.ai.clima.jackagt.plans.UpdateCellsAround",0);
        addPlan("rmit.ai.clima.jackagt.plans.HandlePercept",0);
    }
    
    public GamePlaying(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        inforeporting_cap.__bindNames();
        actiondecision_cap.__bindNames();
        __bindToPlan("rmit.ai.clima.jackagt.plans.SendActionAndWait");
        __bindToPlan("rmit.ai.clima.jackagt.plans.UpdateCellsAround");
        __bindToPlan("rmit.ai.clima.jackagt.plans.HandlePercept");
    }
    
    private rmit.ai.clima.jackagt.data.CurrentStatus __named_data_bel_currentStatus_dat()
    {
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
        return bel_currentStatus_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentPosition __named_data_bel_currentPosition_dat()
    {
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.CurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition");
        return bel_currentPosition_dat;
    }
    
    private rmit.ai.clima.iface.LastActionSentBel __named_data_bel_lastActionSent_dat()
    {
        bel_lastActionSent_dat = (rmit.ai.clima.iface.LastActionSentBel) getNamedObject("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel");
        return bel_lastActionSent_dat;
    }
    
    private rmit.ai.clima.jackagt.data.SimulationProp __named_data_bel_simulationProp_dat()
    {
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        return bel_simulationProp_dat;
    }
    
    private rmit.ai.clima.jackagt.data.GoldAt __named_data_bel_goldAt_dat()
    {
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        return bel_goldAt_dat;
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
    
    public void setEnabled(boolean t)
    {
        super.setEnabled(t);
        inforeporting_cap.setEnabled(t);
        actiondecision_cap.setEnabled(t);
    }
    
}
