  <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Rechercher...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                  <c:url value="/home/" var="home" />
                        <li>
                            <a href="${home}"><i class="fa fa-dashboard fa-fw"></i>
                             <fmt:message key="common.dashboard"/></a>    
                        </li>
                        <c:url value="/article/" var="article" />
                     <li>
                            <a href="${article}"><i class="fa fa-dashboard fa-fw"></i>
                             <fmt:message key="common.article"/></a>    
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message key="common.client"/><span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                 <c:url value="/client/" var="client" />
                                <li>
                                    <a href="${client}"><fmt:message key="common.client"/></a>
                                </li>
                  <c:url value="/commandeClient/" var="cmdClient" />
                                <li>
                                    <a href="${cmdClient}"><fmt:message key="common.client.commande"/></a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                                                <li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message key="common.fournisseur"/><span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                      <c:url value="/fournisseur/" var="fournisseur" />
                                <li>
                                    <a href="${fournisseur}"><fmt:message key="common.fournisseur"/></a>
                                </li>
                      <c:url value="/commandefournisseur/" var="fournisseur" />
                                <li>
                                    <a href="${fournisseur}"><fmt:message key="common.fournisseur.commande"/></a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                   <c:url value="/stock/" var="stock" />
                        <li>
                            <a href="${stock}"><i class="fa fa-table fa-fw"></i> <fmt:message key="common.stock"/></a>
                        </li>
                    <c:url value="/vente/" var="vente" />
                        <li>
                            <a href="${vente}"><i class="fa fa-edit fa-fw"></i><fmt:message key="common.vente"/></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> <fmt:message key="common.parametrage"/><span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                      <c:url value="/utilisateur/" var="user" />
                                      <li>
                                    <a href="${user}"><fmt:message key="common.parametrage.utilisateur"/></a>
                                      </li>
                                      <c:url value="/category/" var="category" />
                                <li>
                                    <a href="${category}"><fmt:message key="common.parametrage.category"/></a>
                                </li>
                             </ul>     <!-- /.nav-second-level -->
                        </ul>
                    </div>
                <!-- /.sidebar-collapse -->
            </div>