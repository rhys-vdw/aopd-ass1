/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.agents;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.interfaces.DebugInterface;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.NumGold;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.CurrentPosition;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.iface.PerceiveClimaServer;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.iface.TellClimaServer;
import rmit.ai.clima.jackagt.events.MEGameEnd;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.events.EStart;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.ECellChange;
import rmit.ai.clima.jackagt.capabilities.GameSyncing;
import rmit.ai.clima.jackagt.capabilities.GamePlaying;
import rmit.ai.clima.iface.ClimaTalking;
import rmit.ai.clima.jackagt.data.CurrentStatus;
import rmit.ai.clima.utility.AgentUtils;
import java.lang.Object;

public class Player extends aos.jack.jak.agent.Agent implements rmit.ai.clima.interfaces.DebugInterface {
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.NumGold bel_numCarryingGold_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.CurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.jackagt.capabilities.GameSyncing gamesyncing_cap;
    public rmit.ai.clima.jackagt.capabilities.GamePlaying gameplaying_cap;
    public rmit.ai.clima.iface.ClimaTalking climatalking_cap;
    public rmit.ai.clima.jackagt.data.CurrentStatus bel_currentStatus_dat;
    private rmit.ai.clima.jackagt.events.MEInformCellStatus meinformcellstatus_s;
    private rmit.ai.clima.jackagt.events.MESimEnd mesimend_s;
    private rmit.ai.clima.jackagt.events.MESimStart mesimstart_s;
    private rmit.ai.clima.iface.PerceiveClimaServer perceiveclimaserver_p;
    private rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_s;
    private rmit.ai.clima.iface.TellClimaServer tellclimaserver_p;
    private rmit.ai.clima.jackagt.events.MEGameEnd megameend_s;
    private rmit.ai.clima.jackagt.events.EUpdateBel eupdatebel_s;
    private rmit.ai.clima.jackagt.events.EStart estart_p;
    private rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    private rmit.ai.clima.jackagt.events.ECellChange ecellchange_p;
    /* Constructor */

    public Player(java.lang.String name)
    {
        super(name);
        boolean __b = getAgentType() == rmit.ai.clima.jackagt.agents.Player.class;
        if (__b) {
            __init1();
            __init2();
        }
        climatalking_cap.setDebug(true);
        if (__b) 
            startAgent();
    }
    
    public Player(java.lang.String name, boolean debugOn)
    {
        super(name);
        boolean __b = getAgentType() == rmit.ai.clima.jackagt.agents.Player.class;
        if (__b) {
            __init1();
            __init2();
        }
        climatalking_cap.setDebug(debugOn);
        if (__b) 
            startAgent();
    }
    
    // showDebug

    public void showDebug(java.lang.String Message)
    {
        send("gui",eguidebugmessage_s.reportMessage(Message));
    }
    
    public void showDebug(java.lang.String Entity, java.lang.String Message)
    {
        showConsoleDebug(Entity + ":: " + Message);
    }
    
    // showConsoleDebug

    public void showConsoleDebug(java.lang.String Entity, java.lang.String Message)
    {
        showConsoleDebug(Entity + ":: " + Message);
    }
    
    public void showConsoleDebug(java.lang.String Message)
    {
        rmit.ai.clima.utility.AgentUtils.reportMessage("******************* [[" + this.name() + "]] " + Message);
    }
    
    public java.lang.Class getAgentType()
    {
        return rmit.ai.clima.jackagt.agents.Player.class;
    }
    
    public void __init1()
    {
        super.__init1();
        setNamedCreator("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_simulationProp_dat();
            }
            
        },true);
        setNamedCreator("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumGold",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_numCarryingGold_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_currentRequestActionId_dat();
            }
            
        },true);
        setNamedCreator("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_currentPosition_dat();
            }
            
        },true);
        setNamedCreator("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_cellEmpty_dat();
            }
            
        },true);
        if (gamesyncing_cap == null) {
            gamesyncing_cap = new rmit.ai.clima.jackagt.capabilities.GameSyncing(this);
            gamesyncing_cap.__initCapability(this,"gamesyncing_cap");
        }
        gamesyncing_cap.__init1();
        if (gameplaying_cap == null) {
            gameplaying_cap = new rmit.ai.clima.jackagt.capabilities.GamePlaying(this);
            gameplaying_cap.__initCapability(this,"gameplaying_cap");
        }
        gameplaying_cap.__init1();
        if (climatalking_cap == null) {
            climatalking_cap = new rmit.ai.clima.iface.ClimaTalking(this);
            climatalking_cap.__initCapability(this,"climatalking_cap");
        }
        climatalking_cap.__init1();
        setNamedCreator("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_currentStatus_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        super.__init2();
        getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumGold");
        getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition");
        getNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty");
        meinformcellstatus_s = (rmit.ai.clima.jackagt.events.MEInformCellStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus");
        mesimend_s = (rmit.ai.clima.jackagt.events.MESimEnd) findEvent("rmit.ai.clima.jackagt.events.MESimEnd");
        mesimstart_s = (rmit.ai.clima.jackagt.events.MESimStart) findEvent("rmit.ai.clima.jackagt.events.MESimStart");
        perceiveclimaserver_p = (rmit.ai.clima.iface.PerceiveClimaServer) findEvent("rmit.ai.clima.iface.PerceiveClimaServer");
        meinformagentstatus_s = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        tellclimaserver_p = (rmit.ai.clima.iface.TellClimaServer) findEvent("rmit.ai.clima.iface.TellClimaServer");
        megameend_s = (rmit.ai.clima.jackagt.events.MEGameEnd) findEvent("rmit.ai.clima.jackagt.events.MEGameEnd");
        eupdatebel_s = (rmit.ai.clima.jackagt.events.EUpdateBel) findEvent("rmit.ai.clima.jackagt.events.EUpdateBel");
        estart_p = (rmit.ai.clima.jackagt.events.EStart) findEvent("rmit.ai.clima.jackagt.events.EStart");
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        ecellchange_p = (rmit.ai.clima.jackagt.events.ECellChange) findEvent("rmit.ai.clima.jackagt.events.ECellChange");
        gamesyncing_cap.__init2();
        gameplaying_cap.__init2();
        climatalking_cap.__init2();
        getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
    }
    
    synchronized private void __init_desc()
    {
        addNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumGold",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",aos.jack.jak.agent.Agent.WRITEABLE);
        gamesyncing_cap = new rmit.ai.clima.jackagt.capabilities.GameSyncing(this);
        gamesyncing_cap.__initCapability(this,"gamesyncing_cap");
        gamesyncing_cap.init_desc();
        gameplaying_cap = new rmit.ai.clima.jackagt.capabilities.GamePlaying(this);
        gameplaying_cap.__initCapability(this,"gameplaying_cap");
        gameplaying_cap.init_desc();
        climatalking_cap = new rmit.ai.clima.iface.ClimaTalking(this);
        climatalking_cap.__initCapability(this,"climatalking_cap");
        climatalking_cap.init_desc();
        addNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.iface.PerceiveClimaServer",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.iface.PerceiveClimaServer",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.iface.TellClimaServer",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.iface.TellClimaServer",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEGameEnd",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EUpdateBel",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EStart",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.ECellChange",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.ECellChange",aos.jack.jak.agent.Agent.POSTED_EVENT);
    }
    
    public void init_desc()
    {
        newAgentDesc("Player");
        super.init_desc();
        __init_desc();
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        gamesyncing_cap.__bindNames();
        gameplaying_cap.__bindNames();
        climatalking_cap.__bindNames();
    }
    
    private rmit.ai.clima.jackagt.data.SimulationProp __named_data_bel_simulationProp_dat()
    {
        if (bel_simulationProp_dat != null) 
            return bel_simulationProp_dat;
        bel_simulationProp_dat = new rmit.ai.clima.jackagt.data.SimulationProp();
        if (!bel_simulationProp_dat.attach(this)) 
            bel_simulationProp_dat = null;
        setNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",bel_simulationProp_dat);
        return bel_simulationProp_dat;
    }
    
    private rmit.ai.clima.jackagt.data.NumGold __named_data_bel_numCarryingGold_dat()
    {
        if (bel_numCarryingGold_dat != null) 
            return bel_numCarryingGold_dat;
        bel_numCarryingGold_dat = new rmit.ai.clima.jackagt.data.NumGold();
        if (!bel_numCarryingGold_dat.attach(this)) 
            bel_numCarryingGold_dat = null;
        setNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumGold",bel_numCarryingGold_dat);
        return bel_numCarryingGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.GoldAt __named_data_bel_goldAt_dat()
    {
        if (bel_goldAt_dat != null) 
            return bel_goldAt_dat;
        bel_goldAt_dat = new rmit.ai.clima.jackagt.data.GoldAt();
        if (!bel_goldAt_dat.attach(this)) 
            bel_goldAt_dat = null;
        setNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",bel_goldAt_dat);
        return bel_goldAt_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentRequestActionId __named_data_bel_currentRequestActionId_dat()
    {
        if (bel_currentRequestActionId_dat != null) 
            return bel_currentRequestActionId_dat;
        bel_currentRequestActionId_dat = new rmit.ai.clima.jackagt.data.CurrentRequestActionId();
        if (!bel_currentRequestActionId_dat.attach(this)) 
            bel_currentRequestActionId_dat = null;
        setNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",bel_currentRequestActionId_dat);
        return bel_currentRequestActionId_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentPosition __named_data_bel_currentPosition_dat()
    {
        if (bel_currentPosition_dat != null) 
            return bel_currentPosition_dat;
        bel_currentPosition_dat = new rmit.ai.clima.jackagt.data.CurrentPosition();
        if (!bel_currentPosition_dat.attach(this)) 
            bel_currentPosition_dat = null;
        setNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition",bel_currentPosition_dat);
        return bel_currentPosition_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CellEmpty __named_data_bel_cellEmpty_dat()
    {
        if (bel_cellEmpty_dat != null) 
            return bel_cellEmpty_dat;
        bel_cellEmpty_dat = new rmit.ai.clima.jackagt.data.CellEmpty();
        if (!bel_cellEmpty_dat.attach(this)) 
            bel_cellEmpty_dat = null;
        setNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",bel_cellEmpty_dat);
        return bel_cellEmpty_dat;
    }
    
    public void setEnabled(boolean t)
    {
        super.setEnabled(t);
        gamesyncing_cap.setEnabled(t);
        gameplaying_cap.setEnabled(t);
        climatalking_cap.setEnabled(t);
    }
    
    private rmit.ai.clima.jackagt.data.CurrentStatus __named_data_bel_currentStatus_dat()
    {
        if (bel_currentStatus_dat != null) 
            return bel_currentStatus_dat;
        bel_currentStatus_dat = new rmit.ai.clima.jackagt.data.CurrentStatus("CurrentStatus.dat");
        if (!bel_currentStatus_dat.attach(this)) 
            bel_currentStatus_dat = null;
        setNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",bel_currentStatus_dat);
        return bel_currentStatus_dat;
    }
    
}
