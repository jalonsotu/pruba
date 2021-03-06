package aima.search.map;

/**
 * The AIMA framework uses dynamic attributes to make implementations of agents
 * and environments completely independent of each other. The disadvantage of
 * this concept is, that it's error-prone. This set of constants is designed to
 * make information exchange more reliable for map agents. Two kinds of
 * attributes are distinguished. Percept attributes are attached to percepts.
 * They are generated by the environment and read by by the agent. Agent
 * attributes are attached to agents. They are also in general generated
 * by the environment but the agents are not allowed to read them.
 * 
 * @author R. Lunde
 */
public class DynAttributeNames {
	/**
	 * Name of a dynamic attribute, which contains the current location of the
	 * agent. Expected value type: String.
	 */
	public static final String AGENT_LOCATION = "location";
	/**
	 * Name of a dynamic attribute, which maintains the total traveling distance
	 * of the agent since birth. Expected value type: Integer.
	 */
	public static final String AGENT_TRAVEL_DISTANCE = "travelDistance";
	/**
	 * Name of a dynamic attribute, which indicates the current status of the
	 * agent, such as traveling, completed or aborted. Expected value type:
	 * String.
	 */
	public static final String AGENT_STATUS = "status";

	/**
	 * Name of a dynamic attribute, which tells the agent where it is. Expected
	 * value type: String.
	 */
	public static final String PERCEPT_IN = "In";
	/**
	 * Name of a dynamic attribute, which tells the agent which actions are
	 * possible at the current location of the agent. Expected value type: List
	 * of alternating Strings and Integers.
	 */
	public static final String PERCEPT_POSSIBLE_ACTIONS = "PossibleActions";
	/**
	 * Name of a dynamic attribute. It provides access to informations which are
	 * available at the current location of the agent.
	 */
	public static final String PERCEPT_INFOS = "Infos";
	/**
	 * Name of a dynamic attribute. It provides access to objects, which are
	 * visible at the current location of the agent.
	 */
	public static final String PERCEPT_OBJECTS = "Objects";
}
