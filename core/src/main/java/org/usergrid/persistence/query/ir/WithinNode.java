/*******************************************************************************
 * Copyright 2012 Apigee Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.persistence.query.ir;

/**
 * Intermediate represnetation of the within operator
 * 
 * @author tnine
 *
 */
public class WithinNode extends QueryNode {

    private String propertyName;
    private float distance;
    private float lattitude;
    private float longitude;
    
    
    
    /**
     * @param propertyName
     * @param distance
     * @param lattitude
     * @param longitude
     */
    public WithinNode(String propertyName, float distance, float lattitude,
            float longitude) {
        this.propertyName = propertyName;
        this.distance = distance;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }
    
    
    /**
     * @return the propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }
    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }
    /**
     * @return the lattitude
     */
    public float getLattitude() {
        return lattitude;
    }
    /**
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /* (non-Javadoc)
     * @see org.usergrid.persistence.query.ir.QueryNode#visit(org.usergrid.persistence.query.ir.NodeVisitor)
     */
    @Override
    public void visit(NodeVisitor visitor) throws Exception {
        visitor.visit(this);
    }
    
  
}
