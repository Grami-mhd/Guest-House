<?php

namespace NaboutBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class DefaultController extends Controller
{
    public function indexAction()
    {
        return $this->render('NaboutBundle:Default:index.html.twig');
    }
}
