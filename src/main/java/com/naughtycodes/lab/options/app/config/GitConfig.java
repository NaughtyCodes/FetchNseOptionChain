package com.naughtycodes.lab.options.app.config;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.errors.TransportException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.springframework.stereotype.Component;

@Component
public class GitConfig {
	
	public void pushToGit() throws IOException, InvalidRemoteException, TransportException, GitAPIException {

		String dir = Arrays.asList(System.getProperty("java.class.path").split(";")).get(0);
		String[] str = dir.toString().split("lab_options");
		dir = dir.toString().replace(str[1],"");
		
		System.out.println("\n>>> Cloning repository\n");
		Repository repo = Git.open (new File(dir)).getRepository(); 

		try (Git git = new Git(repo)) {
			/*
			 * Stage modified files and Commit changes .
			 * 
			 * Equivalent of --> $ git commit -a
			 * 
			 */
			System.out.println("\n>>> Committing changes\n");
			RevCommit revCommit = git.commit().setAll(true).setMessage("Adding commit from JGIT").call();
			System.out.println("Commit = " + revCommit.getFullMessage());
			PushCommand pushCommand = git.push();
			System.out.println("Commit = " + pushCommand.getReceivePack());
			
			/*
			 * Verify commit log
			 * 
			 * Equivalent of --> $ git log
			 * 
			 */
//			System.out.println("\n>>> Printing commit log\n");
//			Iterable<RevCommit> commitLog = git.log().call();
//			commitLog.forEach(r -> System.out.println(r.getFullMessage()));

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}