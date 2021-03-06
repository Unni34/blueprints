//////////////////////////////////////////////////////////////////////////////////////////
//
// Implementation of a simple graph client for the ArangoDB.
//
// Copyright triAGENS GmbH Cologne.
//
//////////////////////////////////////////////////////////////////////////////////////////

package com.arangodb.blueprints.client;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoHost;

/**
 * The arangodb configuration class
 * 
 * @author Achim Brandt (http://www.triagens.de)
 * @author Johannes Gocke (http://www.triagens.de)
 * @author Guido Schwab (http://www.triagens.de)
 * @author Jan Steemann (http://www.triagens.de)
 */

public class ArangoDBConfiguration extends ArangoConfigure {

	/**
	 * Creates a default configuration.
	 * 
	 * Connects to ArangoDB on localhost:8529.
	 */

	public ArangoDBConfiguration() {
	}

	/**
	 * Creates a configuration
	 * 
	 * @param host
	 *            Host name of the ArangoDB
	 * @param port
	 *            Port number of ArangoDB
	 */
	public ArangoDBConfiguration(String host, int port) {
		setArangoHost(new ArangoHost(host, port));
	}

}
